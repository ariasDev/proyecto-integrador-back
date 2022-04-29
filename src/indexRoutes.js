const express = require("express");
const router = express.Router();
const testController = require('./controllers/testController')
const usersController = require('./controllers/usersController')


router.get("/test", testController.test);
router.post('/login', usersController.login)

module.exports = router;