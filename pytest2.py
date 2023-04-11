from urllib.request import URLopener

def test1():
    od = URLopener()
    # ruleid: insecure-urlopener-open-ftp
    od.open("ftp://example.com")

def test1_ok():
    od = URLopener()
