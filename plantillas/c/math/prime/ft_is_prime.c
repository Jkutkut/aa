/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_is_prime.c                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 10:08:41 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 10:08:45 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#define LAST_SQRT 46340

int	ft_sqrt_mod(int nb)
{
	int	r;

	if (nb < 0)
		return (0);
	r = 1;
	while (r <= LAST_SQRT && r * r < nb)
		r++;
	return (r);
}

int	ft_is_prime(int nb)
{
	int	i;
	int	end;

	if (nb <= 1)
		return (0);
	if (nb == 2)
		return (1);
	i = 2;
	end = ft_sqrt_mod(nb);
	while (i <= end)
		if (nb % i++ == 0)
			return (0);
	return (1);
}
