#!/bin/bash

set -eu

lein do clean, eastwood, test, jar, deploy solita-archiva
