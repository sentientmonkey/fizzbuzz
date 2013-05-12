function fizz(i) {
  if((i % 3) == 0){
    return "Fizz";
  }
}

function buzz(i) {
  if((i % 5) == 0){
    return "Buzz";
  }
}

var rules = [fizz,buzz];

function default_rule(result,i){
  if(result.length > 0) {
    return result;
  } else {
    return i;
  }
}

function fizz_buzz(start,end) {
  for(var i=start; i<=end; i++) {
    var result = rules.map(function(rule){
      return rule(i);
    }).join('');
    print(default_rule(result,i));
  }
};

fizz_buzz(1,100);
