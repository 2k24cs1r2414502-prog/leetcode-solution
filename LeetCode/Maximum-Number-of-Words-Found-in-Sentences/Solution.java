for (let i = 0; i < sentences.length; i++) {
    let wordCount = sentences[i].split(' ').length;
    if (wordCount > maxWords) {
        maxWords = wordCount;
    }
}

return maxWords;