function fakeBin(x) {
    let temp = '';
    for (let i = 0; i < x.length; i++) {
        if (Number(x.substring(i, i + 1)) < 5) {
            temp += 0;
        }
        else {
            temp += 1;
        }
    }
    return temp;

} 