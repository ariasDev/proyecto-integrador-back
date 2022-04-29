exports.validateLogin = (body) => {
    const emailJuan = 'juanariah@gmail.com';
    const emailVictor = 'victormanuel2323@hotmail.com';
    const response = {
        'response': '',
        'userName': ''
    };

    if (body.email !== null) {
        if (body.email === emailJuan) {
            response.response = 'welcome';
            response.userName = 'Juan Esteban Arias';
        } else if (body.email === emailVictor) {
            response.response = 'welcome';
            response.userName = 'Victor Manuel Florez';
        } else {
            response.response = 'login error';
        }
    } else {
        response.response = 'login error';
    }
    return response;
}