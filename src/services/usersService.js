exports.validateLogin = (body) => {
    const emailJuan = 'juanariah@gmail.com';
    const emailVictor = 'victormanuel2323@hotmail.com';
    const response = {
        'response': ''
    };

    if (body.email !== null && body.email === emailJuan || body.email === emailVictor) {
        response.response = 'welcome';

    } else {
        response.response = 'login error';
    }
    return response;
}