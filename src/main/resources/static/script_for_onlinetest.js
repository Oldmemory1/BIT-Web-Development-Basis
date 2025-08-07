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

async function submit_answers() {
    try {
        const dict = {};
        //姓名
        const studentName = document.getElementById('student_name');
        const studentNameContent = studentName.value;
        if(studentNameContent){//成功填写姓名
            dict['studentName']=studentNameContent;
        }else{
            throw new Error("姓名未填写");
        }

        //单选题1
        const selectElementOfSelection1 = document.getElementById('selection_1');
        const selectOptionOfSelection1 = selectElementOfSelection1.options[selectElementOfSelection1.selectedIndex];
        dict['question1'] = selectOptionOfSelection1.value;

        //单选题2
        const selectElementOfSelection2 = document.getElementById('selection_2');
        const selectOptionOfSelection2 = selectElementOfSelection2.options[selectElementOfSelection2.selectedIndex];
        dict['question2'] = selectOptionOfSelection2.value;

        //单选题3
        const selectElementOfSelection3 = document.getElementById('selection_3');
        const selectOptionOfSelection3 = selectElementOfSelection3.options[selectElementOfSelection3.selectedIndex];
        dict['question3'] = selectOptionOfSelection3.value;

        //单选题4
        const selectElementOfSelection4 = document.getElementById('selection_4');
        const selectOptionOfSelection4 = selectElementOfSelection4.options[selectElementOfSelection4.selectedIndex];
        dict['question4'] = selectOptionOfSelection4.value;

        //单选题5
        const selectElementOfSelection5 = document.getElementById('selection_5');
        const selectOptionOfSelection5 = selectElementOfSelection5.options[selectElementOfSelection5.selectedIndex];
        dict['question5'] = selectOptionOfSelection5.value;

        //单选题6
        let radiosOfSelection6 = document.getElementsByName("selection_6");
        let selectedValueOfSelection6 = null;
        let selectedTextOfSelection6 = null;
        let selectedIdOfSelection6 = null;
        for(const radio of radiosOfSelection6){
            if(radio.checked){
                selectedValueOfSelection6 = radio.value;
                selectedTextOfSelection6 = radio.text;
                selectedIdOfSelection6 = radio.id;
                const labelOfSelection6 = document.querySelector(`label[for="${selectedIdOfSelection6}"]`);
                if(labelOfSelection6){
                    selectedTextOfSelection6 = labelOfSelection6.textContent;
                }else{
                    selectedTextOfSelection6 = "unknown";
                }
                break;
            }
        }
        if (selectedValueOfSelection6) {
            dict['question6'] = selectedValueOfSelection6;
        } else {
            throw new Error("题目6没有选择选项");
        }

        //单选题7
        let radiosOfSelection7 = document.getElementsByName("selection_7");
        let selectedValueOfSelection7 = null;
        let selectedTextOfSelection7 = null;
        let selectedIdOfSelection7 = null;
        for(const radio of radiosOfSelection7){
            if(radio.checked){
                selectedValueOfSelection7 = radio.value;
                selectedTextOfSelection7 = radio.text;
                selectedIdOfSelection7 = radio.id;
                const labelOfSelection7 = document.querySelector(`label[for="${selectedIdOfSelection7}"]`);
                if(labelOfSelection7){
                    selectedTextOfSelection7 = labelOfSelection7.textContent;
                }else{
                    selectedTextOfSelection7 = "unknown";
                }
                break;
            }
        }
        if (selectedValueOfSelection7) {
            dict['question7'] = selectedValueOfSelection7;
        } else {
            throw new Error("题目7没有选择选项");
        }

        //单选题8
        let radiosOfSelection8 = document.getElementsByName("selection_8");
        let selectedValueOfSelection8 = null;
        let selectedTextOfSelection8 = null;
        let selectedIdOfSelection8 = null;
        for(const radio of radiosOfSelection8){
            if(radio.checked){
                selectedValueOfSelection8 = radio.value;
                selectedTextOfSelection8 = radio.text;
                selectedIdOfSelection8 = radio.id;
                const labelOfSelection8 = document.querySelector(`label[for="${selectedIdOfSelection8}"]`);
                if(labelOfSelection8){
                    selectedTextOfSelection8 = labelOfSelection8.textContent;
                }else{
                    selectedTextOfSelection8 = "unknown";
                }
                break;
            }
        }
        if (selectedValueOfSelection8) {
            dict['question8'] = selectedValueOfSelection8;
        } else {
            throw new Error("题目8没有选择选项");
        }

        //单选题9
        let radiosOfSelection9 = document.getElementsByName("selection_9");
        let selectedValueOfSelection9 = null;
        let selectedTextOfSelection9 = null;
        let selectedIdOfSelection9 = null;
        for(const radio of radiosOfSelection9){
            if(radio.checked){
                selectedValueOfSelection9 = radio.value;
                selectedTextOfSelection9 = radio.text;
                selectedIdOfSelection9 = radio.id;
                const labelOfSelection9 = document.querySelector(`label[for="${selectedIdOfSelection9}"]`);
                if(labelOfSelection9){
                    selectedTextOfSelection9 = labelOfSelection9.textContent;
                }else{
                    selectedTextOfSelection9 = "unknown";
                }
                break;
            }
        }
        if (selectedValueOfSelection9) {
            dict['question9'] = selectedValueOfSelection9;
        } else {
            throw new Error("题目9没有选择选项");
        }

        //单选题10
        let radiosOfSelection10 = document.getElementsByName("selection_10");
        let selectedValueOfSelection10 = null;
        let selectedTextOfSelection10 = null;
        let selectedIdOfSelection10 = null;
        for(const radio of radiosOfSelection10){
            if(radio.checked){
                selectedValueOfSelection10 = radio.value;
                selectedTextOfSelection10 = radio.text;
                selectedIdOfSelection10 = radio.id;
                const labelOfSelection10 = document.querySelector(`label[for="${selectedIdOfSelection10}"]`);
                if(labelOfSelection10){
                    selectedTextOfSelection10 = labelOfSelection10.textContent;
                }else{
                    selectedTextOfSelection10 = "unknown";
                }
                break;
            }
        }
        if (selectedValueOfSelection10) {
            dict['question10'] = selectedValueOfSelection10;
        } else {
            throw new Error("题目10没有选择选项");
        }

        //多选题11
        const checkboxesOfSelection11 = document.getElementsByName("selection_11");
        const selectedValuesOfSelection11 = [];  // 存储选中项的值
        checkboxesOfSelection11.forEach(checkbox => {
            if (checkbox.checked) {
                selectedValuesOfSelection11.push(checkbox.value);
            }
        });
        const resultsOfSelection11 = selectedValuesOfSelection11.join('')
        if(resultsOfSelection11){
            dict['question11'] = resultsOfSelection11;
        }else{
            throw new Error("题目11没有选择选项");
        }

        //多选题12
        const checkboxesOfSelection12 = document.getElementsByName("selection_12");
        const selectedValuesOfSelection12 = [];  // 存储选中项的值
        checkboxesOfSelection12.forEach(checkbox => {
            if (checkbox.checked) {
                selectedValuesOfSelection12.push(checkbox.value);
            }
        });
        const resultsOfSelection12 = selectedValuesOfSelection12.join('')
        if(resultsOfSelection12){
            dict['question12'] = resultsOfSelection12;
        }else{
            throw new Error("题目12没有选择选项");
        }

        //填空题13
        const inputElementOfContent1 = document.getElementById('content_1');
        const contentOfContent1 = inputElementOfContent1.value;
        if(contentOfContent1){
            dict['question13'] = contentOfContent1;
        }else{
            throw new Error("题目13没有填写内容");
        }

        //填空题14
        const inputElementOfContent2 = document.getElementById('content_2');
        const contentOfContent2 = inputElementOfContent2.value;
        if(contentOfContent2){
            dict['question14'] = contentOfContent2;
        }else{
            throw new Error("题目14没有填写内容");
        }

        //填空题15
        const inputElementOfContent3 = document.getElementById('content_3');
        const contentOfContent3 = inputElementOfContent3.value;
        if(contentOfContent3){
            dict['question15'] = contentOfContent3;
        }else{
            throw new Error("题目15没有填写内容");
        }

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
        window.alert("message1");
    } catch (error) {
        console.error('提交错误。', error.message);
        window.alert('提交错误,原因:'+error.message);
    }
}