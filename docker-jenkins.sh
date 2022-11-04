# Build image (replaces existing image)
sudo docker build -f dockerfile-jenkins . -t game
# Remove existing container so it can be replaced with updated one 
sudo docker rm game-container
# Run container in interactive mode
echo "d s a w d d d q" | {
	sudo docker run --name game-container -i game
}
