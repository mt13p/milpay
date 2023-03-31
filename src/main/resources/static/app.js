$(document).ready(function() {
    $('#content').html('<p>Loading...</p>');
    $.getJSON('/api/hello', function(data) {
        $('#content').html('<p>' + data.message + '</p>\n');
    });
    $('#submit-btn').click(function() {
        var name = $('#input-box').val();
        $('#output').text('Hello, ' + name + '!');
    });
});
