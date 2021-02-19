exists()
{
    command -v "$1" >/dev/null 2>&1
}

if exists curl; then
    echo '==========> VERSION DE CURL <=========='
    curl --version
else
    # Installation de cURL
    echo '==========> INSTALLATION DE cURL <=========='
    sudo apt-get install curl -y
fi



if exists node; then
    echo '==========> VERSION DE NODEJS ET NPM <=========='
    node --version
    npm --version
else
    # Installation de NodeJS
    echo '==========> INSTALLATION DE NODEJS <=========='
    curl -sL https://deb.nodesource.com/setup_14.x | sudo -E bash -
    sudo apt-get install nodejs -y
    
    # Verification de l'installation de NodeJS
    echo '==========> VERSION DE NODEJS ET NPM <=========='
    node --version
    npm --version
fi


if exists pm2; then
    echo '==========> VERSION DE PM2 <=========='
    pm2 -v
else
    # Installation de PM2
    echo '==========> INSTALLATION DE PM2 <=========='
    sudo npm install -g pm2
    
    # Activation de PM2/ Lancement au demarrage
    echo '==========> ACTIVATION DE PM2 <=========='
    pm2 startup
    
    
    # Verification de l'installation de PM2
    echo '==========> VERSION DE PM2 <=========='
    pm2 -v
fi

