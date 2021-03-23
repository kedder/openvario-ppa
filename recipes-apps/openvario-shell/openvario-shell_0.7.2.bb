SUMMARY = "Main Menu Shell for Openvario"
HOMEPAGE = "https://github.com/kedder/openvario-shell"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
PYPI_PACKAGE = "openvario-shell"
PR = "r0"

SRC_URI[sha256sum] = "4a57d5ccd3fdbcf9725cdc6710550e99d1639948fe5cc1aebd95e63241d0ec05"

inherit pypi setuptools3

RDEPENDS_${PN} += " \
    python3-core \
    python3-typing \
    python3-typing-extensions \
    python3-urwid \
    python3-setuptools \
    python3-misc \
    python3-asyncio \
    python3-dbus-next \
    python3-json \
    python3-pyserial \
    python3-pyserial-asyncio \
    rsync \
    zap-console-fonts \
"
