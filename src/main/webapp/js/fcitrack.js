function test_a(){
    alert("test");
}

release_actions=new Object(
    function edit(id){
        var rows=$("#form_release table").get(1).rows.length;

        console.log(id);
    }
);