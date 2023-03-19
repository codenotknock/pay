<!DOCTYPE html>
<html>
    <head>
        <title>微信支付</title>
        <meta charset="utf-8">


    </head>

    <body>
        <div id="myQrcode"></div>
        <script src="https://cdn.bootcss.com/jquery/1.5.1/jquery.min.js"></script>
        <script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
        <script>
             jQuery{'#myQrcode'}.qrcode({
                 text: "weixin://wxpay/bizpayurl?pr=e9MsC7gzz"
             })
        </script>


    <h1>hello </h1>
    </body>
</html>
