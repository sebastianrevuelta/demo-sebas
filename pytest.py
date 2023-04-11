from urllib.request import URLopener

def test1():
    od = URLopener()
    # ruleid: insecure-urlopener-open
    od.open("http://example.com")
