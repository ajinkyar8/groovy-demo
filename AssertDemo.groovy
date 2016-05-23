greet = "hello groovy";
assert greet.getAt(0) == "h";
assert greet[1] == 'e';
assert greet[6..11] == 'groovy';
assert 'hi' + greet - 'hello' == 'hi groovy';
