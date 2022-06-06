/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    s=s.split("");
    
    const vowels =['a', 'e', 'i', 'o', 'u'];
    const arr = []
    var aux;
    
    for(let i=0;i<s.length;i++){
        if(vowels.includes(s[i]) || vowels.includes(s[i].toLowerCase()))
            arr.push(i)
    }
    
    for(let i=0;i<arr.length/2;i++){
        aux = s[arr[i]];
        s[arr[i]]=s[arr[arr.length-1-i]]
        s[arr[arr.length-1-i]]=aux;
        
    }
    
    return s.join("");
    
};