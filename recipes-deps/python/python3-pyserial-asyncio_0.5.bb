SUMMARY = "Async I/O extension for the Python Serial Port package"
HOMEPAGE = "https://pyserial-asyncio.readthedocs.io/en/latest/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e8a4b0e902265f3a190eff46d4ca7efd"

SRC_URI[md5sum] = "64d15bfb20982b2129b02070321f49f3"
SRC_URI[sha256sum] = "1641e5433a866eeaf6464b3ab88b741e7a89dd8cd0f851b3343b15f425138d33"

S = "${WORKDIR}/pyserial-asyncio-${PV}"

inherit  pypi setuptools3
RDEPENDS_${PN} += "python3-pyserial"
