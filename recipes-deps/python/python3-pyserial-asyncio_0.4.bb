SUMMARY = "Async I/O extension for the Python Serial Port package"
HOMEPAGE = "https://pyserial-asyncio.readthedocs.io/en/latest/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e8a4b0e902265f3a190eff46d4ca7efd"

SRC_URI[md5sum] = "67244fdc11cc31cf0ebf675c271c71d8"
SRC_URI[sha256sum] = "c40677a8874d8c24d4423a97498746de776f6dbcd0efbb8fa43dcf011a589aee"

S = "${WORKDIR}/pyserial-asyncio-${PV}"

inherit  pypi setuptools3
RDEPENDS_${PN} += "python3-pyserial"
