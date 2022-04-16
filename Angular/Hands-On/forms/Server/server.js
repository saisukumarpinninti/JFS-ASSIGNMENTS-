const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const { message } = require('statuses');
const port = 3000;
const app = express();
app.use(bodyParser.json());
app.use(cors());
app.get('/', (req, res) => { res.send('Hello') });
app.listen(port, () => { console.log(`Server is running on port ${port}`) });
app.post('/enroll', (req, res) => {
    console.log(req.body);
    res.status(200).send({ "message": "Enrolled" });
});