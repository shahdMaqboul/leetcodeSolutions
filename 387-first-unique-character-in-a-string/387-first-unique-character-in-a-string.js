/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    var repetetion={};
    for(let i = 0 ; i< s.length ; i++){ // count repetition of every char
        if(repetetion[s[i]]) repetetion[s[i]]++;
        else repetetion[s[i]] = 1;
    }
    for(let i =0; i< s.length ; i++){
        if(repetetion[s[i]] == 1) return i;
    }
    return -1;
};
