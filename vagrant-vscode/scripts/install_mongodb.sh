exists()
{
    command -v "$1" >/dev/null 2>&1
}

if exists wget; then
    echo '==========> VERSION DE CURL <=========='
    wget --version
else
    # Installation de wget
    # wget est géneralement preinstaller mais on ne sait jamais
    echo '==========> INSTALLATION DE WGET <=========='
    sudo apt-get install wget -y
fi




if exists mongo; then
    echo '==========> VERSION DE MONGODB <=========='
    mongo --version
else
    
    # Installation de MongoDB
    echo '==========> INSTALLATION DE MONGODB <=========='
    wget -qO - https://www.mongodb.org/static/pgp/server-4.4.asc | sudo apt-key add -
    
    
    echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/4.4 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.4.list
    sudo apt-get update
    
    sudo apt-get install -y mongodb-org
    
    # Verification de l'installation de NodeJS
    echo '==========> VERSION DE MONGODB <=========='
    mongo --version
    
    
    # Activation de mongodb
    echo '==========> ACTIVATION DE MONGODB <=========='
    sudo systemctl start mongod
    
    sudo systemctl status mongod
    
    sudo systemctl enable mongod
    
fi