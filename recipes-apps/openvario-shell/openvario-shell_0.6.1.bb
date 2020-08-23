SUMMARY = "Main Menu Shell for Openvario"
HOMEPAGE = "https://github.com/kedder/openvario-shell"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
PYPI_PACKAGE = "openvario-shell"
PR = "r0"

SRC_URI[sha256sum] = "5459702a649f908fc7cba030c5596d5a3181e25abd9304d1e8eab8b8e94af021"

inherit pypi setuptools3

RDEPENDS_${PN} += " \
    python3-core \
    python3-typing \
    python3-typing-extensions \
    python3-urwid \
    python3-setuptools \
    python3-misc \
    python3-asyncio \
    python3-json \
    python3-pyserial \
    python3-pyserial-asyncio \
    zap-console-fonts \
"
