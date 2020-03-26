SUMMARY = "Rebuilds the package repo"
LICENSE = "MIT"

DEPENDS = "openvario-compman"

inherit nopackages

deltask do_fetch
deltask do_unpack
deltask do_patch
deltask do_configure
deltask do_compile
deltask do_populate_sysroot

DEPLOY_DIR_PPA = "${DEPLOY_DIR}/ppa"

do_build_ppa[nostamp] = "1"
python do_build_ppa() {
    from oe.rootfs import create_packages_dir

    create_packages_dir(d, d.getVar("DEPLOY_DIR_PPA"), d.getVar("DEPLOY_DIR_IPK"), "package_write_ipk", True)
    indexer = OpkgIndexer(d, d.getVar("DEPLOY_DIR_PPA"))
    indexer.write_index()
}

do_index_ppa[nostamp] = "1"
do_index_ppa[depends] += "${PACKAGEINDEXDEPS}"
python do_index_ppa() {
    from oe.rootfs import OpkgIndexer

    indexer = OpkgIndexer(d, d.getVar("DEPLOY_DIR_PPA"))
    indexer.write_index()
}

addtask do_build_ppa after do_build
addtask do_index_ppa after do_build_ppa
EXCLUDE_FROM_WORLD = "1"
