function idCheck(){
    var idValue = document.getElementById("id").value;
    var regId = /^[a-zA-Z0-9]{4,12}$/;
    if(!regId.test(idValue)){
        alert("4~12자 영문 대소문자, 숫자만 입력하세요.");
    }else{
        alert("id ok");
    }
}

function pwCheck(){
    var pwValue = document.getElementById("pw").value;
    var regPw = /^[a-zA-Z0-9]{4,12}$/;
    if(!regPw.test(pwValue)){
        alert("4~12자 영문 대소문자, 숫자만 입력하세요.");
    }else{
        alert("pw ok");
    }
}

function pwCheck2(){
    var pw1 = document.getElementById("pw").value;
    var pw2 = document.getElementById("pw2").value;
    if(pw1==pw2){
        alert("비밀번호 확인 완료!");
    } else{
        alert("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
    }
}

function mailCheck() {
    var emailValue = document.getElementById("mail").value;
    var regEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
    if(!regEmail.test(emailValue)){
        alert('이메일 형식이 올바르지 않습니다.');
    }else{
        alert('email ok')
    } 
}

function numCheck(){
    var idnum = document.getElementById("idnum");
    var yeartb = document.getElementById("year");
    var regNum = /^[0-9]{13}$/;
    if(!regNum.test(idnum.value)){
        alert('주민등록번호 형식이 올바르지 않습니다.');
    }else{
        var n = idnum.value.split("");
        var year;
        if(n[0]*1<5){
            year = "20"+n[0]+n[1];
        } else{
            year = "19"+n[0]+n[1];
        }
        var month = (n[2]+n[3])*1;
        var m = document.getElementById("month");
        m.value=month;
        var day = (n[4]+n[5])*1;
        var d = document.getElementById("day");
        d.value=day;
        yeartb.value=year;
        birthCheck();
    }
}

function birthCheck(){
    var nyear = document.getElementById("year").value;
    var nmonth = document.getElementById("month").value;
    var nday = document.getElementById("day").value;
    var today = new Date();
    var tyear = today.getFullYear();
    if(nyear>tyear){
        alert("생년월일 오류!");
    } else if(nmonth<1 || nmonth>12){
        alert("생년월일 오류!");
    } else if(nday>31 || nday<1){
        alert("생년월일 오류!");
    } else if((nmonth==4||nmonth==6||nmonth==9||nmonth==11)&&nday==31){
        alert("생년월일 오류!");
    } else if(nmonth==2){
        var isleap = (nyear%4==0 && (nyear%100!=0||nyear%400==0));
        if(nday>29||(nday==29 && !isleap)){
            alert("생년월일 오류!");
        }else{
            alert("birthday ok!");
        }
    } else{
        alert("birthday ok!");
    }
}

function lastCheck(){
    var hobby_count=0;
    var hobby =document.getElementsByName("hobby");
    for(var i=0; i<hobby.length; i++){
        if(hobby[i].checked) hobby_count++;
    }
    if(hobby_count<2){
        alert("관심분야가 너무 적습니다!");
        return -1;
    } else {
        var introduce = document.getElementById("introduce");
        if(introduce.value.length<10){
            alert("자기소개가 너무 짧습니다!");
            return -1;
        } else{
            if(document.getElementById("name").value.length<1){
                alert("이름을 입력하세요!");
                return -1;
            } else{
                alert("회원가입 완료!");
            }
        }
    }
}


