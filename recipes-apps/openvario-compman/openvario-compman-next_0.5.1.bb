SUMMARY = "Competition Manager for OpenVario"
HOMEPAGE = "https://github.com/kedder/openvario-compman"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
PYPI_PACKAGE = "openvario-compman"

SRC_URI[sha256sum] = "2d934acb31dc5e4d8bb5cb5f3590ca3d613a9f69ffca015d10bd74a1c90dde32"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-aiodns python3-requests python3-aiohttp python3-lxml python3-urwid python3-setuptools python3-typing "
RDEPENDS_${PN} += "python3-core"
