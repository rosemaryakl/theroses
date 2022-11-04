# Build image (replaces existing image)
sudo docker build . -t game
# Remove existing container so it can be replaced with updated one 
sudo docker rm game-container
# Run container in interactive mode
sudo docker run --name game-container -i game
