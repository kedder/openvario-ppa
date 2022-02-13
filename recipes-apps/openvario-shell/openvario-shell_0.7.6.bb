SUMMARY = "Main Menu Shell for Openvario"
HOMEPAGE = "https://github.com/kedder/openvario-shell"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
MAINTAINER = "Andrey Lebedev <andrey.lebedev@gmail.com>"
PYPI_PACKAGE = "openvario-shell"
PR = "r1"

SRC_URI[sha256sum] = "67b424c64784105aeaaa39a095b085f32d5a7a45b724fd4863b5b81fd8d8034f"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-core \
    python3-profile \
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
    connman \
"
