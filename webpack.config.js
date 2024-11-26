const path = require('path');
const webpack = require('webpack');

module.exports = {
    entry: [
        './src/main/resources/static/script/global.js',
        // './src/main/resources/static/script/environment.js'
    ],
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
    resolve: {
        fallback: {
            path: false,
            os: false,
            crypto: false,
        },
        extensions: [
            '.js'
        ],
    },
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, './src/main/resources/static/script'),
    },
    mode: 'development',
    plugins: [
    ]
};