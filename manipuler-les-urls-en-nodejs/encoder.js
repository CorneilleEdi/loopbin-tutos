const url = new URL('mongo://localhost:27017')


url.username = 'corneille'
url.password = 'verniselle'
url.pathname = '/utilisateur'
url.searchParams.append('authDB', 'admin')

console.log(url.href)
