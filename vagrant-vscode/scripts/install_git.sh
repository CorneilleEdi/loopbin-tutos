exists()
{
    command -v "$1" >/dev/null 2>&1
}

if exists git; then
    echo '==========> VERSION DE GIT <=========='
    git version
else
    # Installation de GIT
    echo '==========> INSTALLATION DE GIT <=========='
    sudo apt install git -y
    
    # Verification de l'installation de git
    echo '==========> VERSION DE GIT <=========='
    git version
    
    # Installation de Commitizen pour le formattage des messages de commit
    echo '==========> INSTALLTION DE COMMITIZEN <=========='
    sudo npm install -g commitizen
fi
