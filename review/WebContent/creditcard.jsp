<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Credit Card</title>

<script src="https://ajax.googleapis.com/ajax/libs/prototype/1.7.2.0/prototype.js" type="text/javascript"></script>

</head>
<body>

CC number: <input id="creditCardField"/> <input type="submit" value="AJAX check" onclick="validateCreditCardNumber()"/> Validation check: <input id="valdiationCheckField"/>

<script>

	function validateCreditCardNumber(){
		let number = $('creditCardField').getValue();
		
		new Ajax.Request('/review/CardValidateServlet', {
			method:'post',
			parameters: {creditCardNumber: number},
				onSuccess: function(transport) {
				var response = transport.responseText;
				$("valdiationCheckField").setValue(response);
			},
			onFailure: function() { alert('Something went wrong...'); }
		});
		
	}

</script>

</body>
</html>