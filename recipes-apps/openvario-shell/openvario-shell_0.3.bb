SUMMARY = "Main Menu Shell for Openvario"
HOMEPAGE = "https://github.com/kedder/openvario-shell"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
PR = "r1"

SRC_URI[sha256sum] = "7fda7117034fca57d8cadf45c6ebc6b089ca2d821ad708c42e7b59ce4130a6b1"

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
    zap-console-fonts \
"
