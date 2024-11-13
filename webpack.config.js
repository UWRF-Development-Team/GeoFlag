const path = require('path');

module.exports = {
    entry: [
        './src/main/resources/static/script/global.js',
        './src/main/resources/static/script/environment.js'
    ],

    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, 'src/main/resources/static/script'),
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                use: {
                    loader: 'babel-loader',
                },
            },
        ],
    },
};