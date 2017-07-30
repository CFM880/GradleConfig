#!/usr/bin/env bash
cd app_bottom_icon/green
for files in `ls`
do
    mv $files `echo "unselected_$files" `
done
