include .env

IMAGE_OVSHELL_PAT = $(OPENVARIO_IMAGE_DIR)/OpenVario-linux-openvario-image-ovshell-glibc-ipk-current-*.rootfs.img.gz
IMAGE_OVSHELL=$(shell ls -t $(IMAGE_OVSHELL_PAT) | head -1)

all:
	@echo See Makefile for specific command

.ONESHELL:
flash:
	@set -e
	sudo echo Preparing to flash $(SDCARD_DEVICE) with $(IMAGE_OVSHELL)
	sudo umount --verbose $(SDCARD_DEVICE)* || true
	echo "Press ENTER to continue, or Ctrl-C to stop"
	read RESP
	echo Flashing...
	zcat $(IMAGE_OVSHELL) | sudo dd of=$(SDCARD_DEVICE) status=progress
	sync
	echo
	echo All done, you can remove the SD card
