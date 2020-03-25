SUMMARY = "Competition Manager for OpenVario"
HOMEPAGE = "https://github.com/kedder/openvario-compman"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"

SRC_URI[md5sum] = "65a443dcdbcf499f14fe688f43aec894"
SRC_URI[sha256sum] = "c33f55d903a07fc0e577adef48219102c178b479846206e18d30ff839ad3d1bc"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-aiodns python3-aiohttp python3-lxml python3-urwid python3-setuptools python3-typing "
RDEPENDS_${PN} += "python3-core"
