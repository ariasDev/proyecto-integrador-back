const usersService = require('../services/usersService')

exports.login = async (req, res, next) => {
    try {
        const responseService = await usersService.validateLogin(req.body);
        res.status(200).json({ "response": responseService });
    } catch (error) {
        res.status(400).json({ "response": 'login error' });
    }
}