const btn = document.getElementById('myBtn');
const btn2 = document.getElementById('myBtn2');
const btn3 = document.getElementById('myBtn3');
const body = document.getElementsByTagName('body')[0];

const listener = function () {
	btn.addEventListener('click', async () => {
		const { paintRed } = await import('./functions.mjs');

		paintRed(body);
	});

	btn2.addEventListener('click', async () => {
		const { paintWhite } = await import('./functions.mjs');

		paintWhite(body)
	})

	btn3.addEventListener('click', async () => {
		const { paintBlack } = await import('./functions.mjs');

		paintBlack(body)
	})
};


listener();