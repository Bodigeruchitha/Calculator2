function reverseWords(sentence) {
    const words = sentence.split(' '); 
    const reversedWords = words.map(word => word.split('').reverse().join('')); /
    const reversedSentence = reversedWords.join(' '); 
    return reversedSentence;
  }
  
  const inputSentence = "My name is ruchitha";
  const reversedSentence = reverseWords(inputSentence);
  console.log(reversedSentence);