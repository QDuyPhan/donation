
// javaScript để set active cho thẻ a
document.querySelectorAll('a').forEach(link => {
    link.addEventListener('click', function() {
        const page = this.getAttribute('data-page');
        localStorage.setItem('activePage', page);
    });
});

// Khi trang được tải
window.addEventListener('load', function() {
    const activePage = localStorage.getItem('activePage');
    if (activePage) {
        document.querySelectorAll('a').forEach(link => {
            if (link.getAttribute('data-page') === activePage) {
                link.classList.add('activePage');
            }
        });
    }
});