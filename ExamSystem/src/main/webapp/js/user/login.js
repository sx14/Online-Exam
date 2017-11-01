/**
 * Created by wzh on 2017/2/27.
 */
$('#submit').click(function () {

    // alert("!!!");
    var memberId = $('#memberId').val();
    var password = $('#password').val();
    $.post("/user/login",
        {
            'userId':memberId,
            'password':password

        },
        function(data,status){
            if(data.status=="SUCCESS"){
                alert("登录成功!")
            }else {
                alert("登录失败!")
            }
        });
});