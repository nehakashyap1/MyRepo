WinWait("[CLASS:#MozillaDialogClass]","",8)

; Perform keyboard ALT key down + s + ALT key Up action to select Save File Radio button using keyboard sortcut.
Send("{ALTDOWN}s{ALTUP}")

; Wait for 3 seconds
Sleep(3000)

; Press Keyboard ENTER button.
Send("{ENTER}")