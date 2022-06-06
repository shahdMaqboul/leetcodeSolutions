/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let s1 = s.split("").sort(); // convert string to array, then sort that array.
    let t1 = t.split("").sort();
    let len = Math.max(s1.length, t1.length)
    
    for(let i=0;i<len;i++){
        if (s1[i] != t1[i]){
            return false;
        }
    }
    return true;

};