package com.torres.springboot.backend.apirest.auth;

public class JwtConfig {
	
	public static final String RSA_PRIVADA ="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAvDOfAkgy56Kg0t4X/g+bfa0OO1eofBmYx84df7hrTAByk1DQ\r\n" + 
			"YnVKq+YhwFN+rXGY26A7rwTBjcoYxhxwuNkpfTIOBN9T5j0cM/yqmre03AwgaXcK\r\n" + 
			"Gkkn+NBFq6iwtLdlZut2oKi0FZpxU+ghcdSMWnh9bD1FqunfnCrlD9e4mivveP8P\r\n" + 
			"rm47cTpFwz/40jQ3/r+QwgD3t95xPEUKaayIcPgJHk/GthPskMiF0ThXUDntVawe\r\n" + 
			"Ey4kmRmFG0JTLQoTxzqwZD+8vtgDSnFQGvO2VxZDCl3+P6yhj953CKsPhNTG6s2j\r\n" + 
			"Q4VWuYKeRWrg9QYP/JNSrrdLXu9EjxRZj7Po7QIDAQABAoIBAGcVu13rn/5ihMab\r\n" + 
			"ofamI9w1wxrcC8xV1Op0SpIfuJ27jQaF+G5Foq3/crM+yJ9GHp0F6ksWRtJcRS+W\r\n" + 
			"emO1h1Us6qLelL0C8gTDu8rdHvJ8rfA2pND7CyrtIYxB7PA/mApEpQig/2rp2nNE\r\n" + 
			"LbWE34/aeZClCxjv22xVznvcBCBlSeO0qYc5CTe0WGnmk/KZfvYIhisWFd7V45w4\r\n" + 
			"xp+DS+5Xa3lGZU3BXvwUqsg7kaQxm6fmcCntGJDM+tK72uoBsYrcEsWzaVRJKyh7\r\n" + 
			"sfAXXGzmQZnHrg2Nt+eBtEeOuc9p10z5tW1fscmgmcGRWjCZDwq4VZKOhJzXLosm\r\n" + 
			"hzkLof0CgYEA2/xWlSGiswfCUT5570izGDZTLBum38vBxHdruOVnxTR73NDpTqNW\r\n" + 
			"ClRUQFmdfvHL5wFzLYoGuRklYhoZSYPCj5AmDg0FBmoGyS2dvz1giERiYj9HM+tk\r\n" + 
			"I9cRhIFfJMDscaZLtZSR+PkTh/wDeHS4VAIrmGZF5ZA0RsR7HSISnRMCgYEA2wM0\r\n" + 
			"WPJ1OWAQsnUpqmTx8NNChckdwtndOtBMotl70JT4a2zxouzne9TdQV/auu6BiaF9\r\n" + 
			"4SaF9XsqHivhYCriGGPMRfXwnZZNbSJKS6Q09js/YZhpFQQTnzW54uibJUObYQHk\r\n" + 
			"WP2f6X3O/SsYHysNPx8EBRYSikoxVDkWLXKuIf8CgYBnrIaJhe6NfSyg6VbB5Hsy\r\n" + 
			"//c2pFmCwx4wny9PVh4PnGp7aKFrhCK6f3+tTA6jkwTLe61yWshMV4N8tlwQf14k\r\n" + 
			"FoU4vf4ORc2o5iyfwidKUSAkuTmvSFJLacJBtk7GnX1RGlQ34SriMVB5F9Xy4N82\r\n" + 
			"CEfPbPOn+swIRfTXiAVJrQKBgQCEk5QEpADCEp0I6lOmiiTLG5eRVQVnBmsdRyqd\r\n" + 
			"CfohcYxPu0sqzS3zkA+/mz7VGbvgjJmeyasdxsjgKr/rbwoeqYrmbtKREoMcJT3E\r\n" + 
			"PEqzI3piodg6mJUoM2WrLhN8o0hTmMmZ9S3wMfAy4PthIraKF0Rfr9TZUcA6s7Px\r\n" + 
			"HxK6EQKBgQDF2cR0bKa0K81raDcXVumUoXUXObDdg7yJV83ikBAn15hE8IhE4pKa\r\n" + 
			"F12xwD2soCFsTarTt2etI0XOtD8kckVvT2jqkW1hlsGL9ahOIWELnZ+zJz5dGQYr\r\n" + 
			"UlmHuOTDPUu2e78WVJk4qqUaciC2esZN8/ex1V3SDkbV6MIM6d/cJA==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvDOfAkgy56Kg0t4X/g+b\r\n" + 
			"fa0OO1eofBmYx84df7hrTAByk1DQYnVKq+YhwFN+rXGY26A7rwTBjcoYxhxwuNkp\r\n" + 
			"fTIOBN9T5j0cM/yqmre03AwgaXcKGkkn+NBFq6iwtLdlZut2oKi0FZpxU+ghcdSM\r\n" + 
			"Wnh9bD1FqunfnCrlD9e4mivveP8Prm47cTpFwz/40jQ3/r+QwgD3t95xPEUKaayI\r\n" + 
			"cPgJHk/GthPskMiF0ThXUDntVaweEy4kmRmFG0JTLQoTxzqwZD+8vtgDSnFQGvO2\r\n" + 
			"VxZDCl3+P6yhj953CKsPhNTG6s2jQ4VWuYKeRWrg9QYP/JNSrrdLXu9EjxRZj7Po\r\n" + 
			"7QIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
