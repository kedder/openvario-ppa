SUMMARY = "Competition Manager for OpenVario"
HOMEPAGE = "https://github.com/kedder/openvario-compman"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"

SRC_URI[sha256sum] = "ef99aa9f7110caa9354f649a7f4a0749aed775fac769d3b92b095c57d26528d7"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-aiodns python3-aiohttp python3-lxml python3-urwid python3-setuptools python3-typing "
RDEPENDS_${PN} += "python3-core"
