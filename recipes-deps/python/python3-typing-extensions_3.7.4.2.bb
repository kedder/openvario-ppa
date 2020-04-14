SUMMARY = "Backported and Experimental Type Hints for Python 3.5+"
HOMEPAGE = "https://github.com/python/typing/blob/master/typing_extensions/README.rst"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

SRC_URI = "https://files.pythonhosted.org/packages/6a/28/d32852f2af6b5ead85d396249d5bdf450833f3a69896d76eb480d9c5e406/typing_extensions-${PV}.tar.gz"
SRC_URI[md5sum] = "f2674282966dc088d10170c2347431cc"
SRC_URI[sha256sum] = "79ee589a3caca649a9bfd2a8de4709837400dfa00b6cc81962a1e6a1815969ae"

S = "${WORKDIR}/typing_extensions-${PV}"

inherit setuptools3

RDEPENDS_${PN} += "python3-typing"
RDEPENDS_${PN} += "python3-core"
