/**
 * Created by wzh on 2017/2/27.
 */
$('#submit').click(function () {

    // alert("!!!");
    var memberId = $('#memberId').val();
    var password = $('#password').val();
    $.post("/member/login",
        {
            'userId':memberId,
            'password':password

        },
        function(data,status){
            if(data.status=="SUCCESS"){
                window.location.href="/page/member/room";
            }else {
                alert(data.reason)
            }
        });
});