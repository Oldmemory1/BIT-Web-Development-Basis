// script.js
async function test() {
    try {
        const dict = {
            name: "LiMing",
            id: "1024",
            question1: "A",
            question2: "B",
            question3: "C",
            question4: "D"
        };
        const response = await fetch('http://localhost:8192/api/submit_answer', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(dict)
        });
        const result = await response.json();
        console.log(result.data);
        console.log(result.status);
        console.log(result.message);
    } catch (error) {
        console.error('请求错误:', error);
    }
    window.alert("message1");
}