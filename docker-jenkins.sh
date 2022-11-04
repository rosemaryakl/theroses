#!/bin/bash 
# Build image (replaces existing image)
docker build -f dockerfile-jenkins . -t game
# Run container in interactive mode and delete after exiting
echo \"d s a w d d d q\" | docker run --rm --name game-container -i game
