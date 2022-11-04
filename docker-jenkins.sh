# Build image (replaces existing image)
docker build -f dockerfile-jenkins . -t game
# Remove existing container so it can be replaced with updated one 
docker rm game-container
# Run container in interactive mode
echo "d s a w d d d q" | {
	docker run --name game-container -i game
}
