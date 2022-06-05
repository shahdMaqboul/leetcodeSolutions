/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    if(s==null) 
        return true;
    
    s = s.toLowerCase().split("");
    
    for(let i=s.length - 1 ; i>=0 ; i-- ){
         if(s[i].toUpperCase()===s[i].toLowerCase() && 
           !(s[i]>=0 && s[i]<=9)){ // remove non-alphanumeric characters
            s.splice(i,1)
        }
    }

    s = s.join("").split(" ").join(""); // to remove spaces
    
    for(let i=0 ; i< s.length /2 ; i++ ){
         if(s[i] != s[s.length-1-i]){
            return false;
        }
    }
    return true;
    
};