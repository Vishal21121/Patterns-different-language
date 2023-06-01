var generate = function(numRows){
    var result = [];
    if(numRows == 0)
     return result;
     result.push([1]);
     for(var i = 1; i < numRows; i++){
        let list = [];
        list.push(1);
        for(var j = 1; j < result[i-1].length; j++){
            let sum = result[i-1][j-1] + result[i-1][j];
            list.push(sum);
        }
        list.push(1);
        result.push([...list]);
    }
    return result;

}