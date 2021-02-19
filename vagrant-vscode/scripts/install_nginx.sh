exists()
{
    command -v "$1" >/dev/null 2>&1
}

if exists nginx; then
    echo '==========> VERSION DE NGINX <=========='
    nginx -v
else
    # Installation de NGINX
    echo '==========> INSTALLATION DE NGINX <=========='
    sudo apt install nginx -y
    
    # Verification de l'installation de nginx
    echo '==========> VERSION DE NGINX <=========='
    nginx -v
    
    # Status de NGINX
    echo '==========> STATUS DE NGINX <=========='
    sudo systemctl status nginx
fi
